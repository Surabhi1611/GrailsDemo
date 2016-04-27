package com.ttnd.demo

import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse
import grails.transaction.Transactional

@Transactional
class HttpRequestsService {

    RestResponse makeRequest() {
        String url = "https://xecdapi.xe.com/v1/convert_to.json/?to=INR&from=AED&amount=1"
        RestBuilder restBuilder = new RestBuilder()
        RestResponse response = restBuilder.get(url) {
            auth("tothenew861870114","1cga0vjl6v7phr69rog27lmoqv")
        }
        response
    }
}
