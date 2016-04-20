package com.ttnd.demo

class DocumentResource {

    String filePath
    String fileName
    String contentType
    static transients = ['contentType', 'fileName']

    static constraints = {
        filePath(nullable: false)
//        contentType(bindable: true, nullable: true, matches: Constants.DOCUMENT_CONTENT_TYPE)
    }

    String setContentType(String ctype) {
        contentType = ctype
    }

    String getContentType() {
        this.contentType
    }
}
