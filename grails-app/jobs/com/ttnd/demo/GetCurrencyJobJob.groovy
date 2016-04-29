package com.ttnd.demo

class GetCurrencyJobJob {

    def httpRequestsService

    static triggers = {
      cron name: "automaticUpdate", cronExpression: "0 13 10 29 4 ?"
    }

    def execute() {
        httpRequestsService.makeRequest()
        println "Job Executed successfully."
    }
}
