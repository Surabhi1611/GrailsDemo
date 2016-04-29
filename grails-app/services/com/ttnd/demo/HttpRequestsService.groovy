package com.ttnd.demo

import grails.converters.JSON
import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse
import grails.transaction.Transactional
import groovy.json.JsonSlurper
import groovy.json.JsonSlurperClassic

@Transactional
class HttpRequestsService {

    def getList() {
        String url = "https://xecdapi.xe.com/v1/currencies.json/?obsolete=false"
        RestBuilder restBuilder = new RestBuilder()
        RestResponse response = restBuilder.get(url) {
            auth("tothenew861870114","1cga0vjl6v7phr69rog27lmoqv")
        }
        Map result = convertJsonToMap(response)
        List currencyList =[]
        result.currencies.each {
            currencyList.add(it.iso)
        }
        currencyList
    }

    void makeRequest(){
        String fromList = getList().join(",")
        String url = "https://xecdapi.xe.com/v1/convert_to.json/?to=AED&from=${fromList}&amount=1"
        RestBuilder restBuilder = new RestBuilder()
        RestResponse response = restBuilder.get(url) {
            auth("tothenew861870114","1cga0vjl6v7phr69rog27lmoqv")
        }
        response.json.from.each {
            CurrencyRate currencyRate = new CurrencyRate(currency: it.quotecurrency, rate: it.mid)
            currencyRate.save(flush: true)
        }
    }

    def convertJsonToMap(RestResponse rr){
        String str = rr.json.toString()
        JsonSlurperClassic slurper = new JsonSlurperClassic()
        Map parsedMap = (Map)slurper.parseText(str)
        parsedMap
    }
}