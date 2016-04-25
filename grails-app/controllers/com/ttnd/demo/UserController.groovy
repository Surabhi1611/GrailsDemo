package com.ttnd.demo

import com.ttnd.demo.CO.*
import com.ttnd.demo.VO.*
import com.ttnd.demo.*
import grails.converters.JSON
import org.grails.web.json.JSONArray

import java.util.zip.GZIPOutputStream


class UserController {

    def index() {
        render(view: 'index.gsp')
    }

    def register() {
    }

    def registeration(RegisterCO registerCO) {
        String msg = ""
        User user = new User()
        user.properties = registerCO.properties
        if (user.validate()) {
            user.save(flush: true)
            msg = "User saved successfully."
        } else {
            msg = "Problem in saving user."
        }
        flash.message = msg
        redirect(controller: "user", action: "viewPage")
    }

    def view() {
    }

    def viewPage() {
        render(view: '/user/view')
    }

    def delete(Long id) {
        User user = User.load(id)
        if (user) {
            user.delete(flush: true)
            flash.message = "User deleted successfully."
        } else {
            flash.error = "Problem in accessing user."
        }
        redirect(controller: 'user', action: 'viewPage')
    }

    def edit(Long id) {
        println id
        User user = User.findById(id as Long)
        render(view: '/user/edit', model: [user: user])
    }

    def editPage(Long userId) {
        User user = User.get(userId as Long)
        if (user) {
            user.firstName = params.firstName
            user.lastName = params.lastName
            user.email = params.email
            user.userName = params.userName
            if (user.password) {
                user.password = params.password
            }
            if (user.validate()) {
                user.save(flush: true)
                flash.message = "User updated successfully."
            } else {
                flash.error = "Problem in saving user."
            }
        } else {
            flash.error = "Problem in loading user."
        }
        redirect(controller: 'user', action: 'viewPage')
    }

    def fetchUsers(SearchCO searchCO) {
        searchCO.length = params.length ? params.int("length") : 10
        searchCO.start = params.start ? params.int("start") : 0
        List<User> userList = User.search(searchCO).list(max: searchCO.length, offset: searchCO.start, order: searchCO.fetchSortingOrder(), sort: searchCO.fetchSortProperty())
        List<UserVO> users = userList.collect {
            new UserVO(id: it.id, firstName: it.firstName, lastName: it.lastName, userName: it.userName, email: it.email)
        }
        render(["data": users, "recordsTotal": User.count(), "recordsFiltered": User.count()] as JSON)
    }

    def upload() {
        def user = new User(
                firstName: "Shivangi",
                lastName: "Gupta",
                userName: "Delhi"
        )
        Map result = [user: user]
        /* final String grailsVersion = grailsApplication.metadata.getGrailsVersion()
         final String groovyVersion = GroovySystem.version
         header 'X-Powered-By', "Grails: $grailsVersion, Groovy: $groovyVersion"*/
//        response.addHeader("Content-Encoding", "gzip")
/*
        String ae = request.getHeader("accept-encoding")

        if (ae != null && ae.indexOf("gzip") != -1) {
                response.addHeader("Content-Encoding", "gzip");
                GZIPResponseWrapper gzipResponse =
                        new GZIPResponseWrapper(response)
            response
            }*/
        render result
//        chain.doFilter(request, response);
    }

    def converter() {
        render(view: 'converter', model: [list:['AED', 'USD', 'INR', 'EUR', 'CAD']])
    }

    def convert() {
        println "--------------------------${params}-------------------"
        String stringUrl = "https://xecdapi.xe.com/v1/convert_to.json";
        URL url = new URL(stringUrl);
        URLConnection uc = url.openConnection();
        uc.setRequestProperty("X-Requested-With", "Curl");
        String userpass = "tothenew861870114" + ":" + "1cga0vjl6v7phr69rog27lmoqv";
        String basicAuth = "Basic " + new String(new Base64().encode(userpass.getBytes()));
        uc.setRequestProperty("Authorization", basicAuth);
        InputStreamReader inputStreamReader = new InputStreamReader(uc.getInputStream());
        render params
    }

}
