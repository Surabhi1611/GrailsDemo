package com.ttnd.demo

class GetCurrencyJobJob {

    def httpRequestsService

    static triggers = {
      cron name: "automaticUpdate", cronExpression: "0 0/1 * 1/1 * ? *"
    }

    def execute() {
        httpRequestsService.makeRequest()
        println "Job Executed successfully."
    }
}
