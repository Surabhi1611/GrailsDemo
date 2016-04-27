package com.ttnd.demo

class GetCurrencyJobJob {

    def httpRequestsService

    static triggers = {
      cron name: "automaticUpdate", cronExpression: "0 47 15 27 4 ?"
    }

    def execute() {
        httpRequestsService.makeRequest()
        println "Job Executed successfully."
    }
}
