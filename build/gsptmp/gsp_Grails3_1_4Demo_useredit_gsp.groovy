import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.compiler.transform.LineNumber
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_Grails3_1_4Demo_useredit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('textField','g',15,['name':("firstName"),'value':(user.firstName),'type':("text"),'class':("form-control")],-1)
printHtmlPart(6)
invokeTag('textField','g',23,['name':("lastName"),'value':(user.lastName),'type':("text"),'class':("form-control")],-1)
printHtmlPart(7)
invokeTag('textField','g',31,['name':("email"),'value':(user.email),'type':("email"),'class':("form-control")],-1)
printHtmlPart(8)
invokeTag('textField','g',39,['name':("userName"),'value':(user.userName),'class':("form-control")],-1)
printHtmlPart(9)
invokeTag('passwordField','g',47,['name':("password"),'value':(user.password),'class':("form-control")],-1)
printHtmlPart(10)
invokeTag('hiddenField','g',51,['name':("userId"),'value':(user.id)],-1)
printHtmlPart(11)
invokeTag('submitButton','g',55,['value':("Save"),'action':("editPage"),'name':("Edit"),'class':("btn btn-default"),'style':("float:right; background-color:#d2d4d9")],-1)
printHtmlPart(12)
})
invokeTag('form','g',57,['class':("form-vertical"),'controller':("user"),'action':("editPage")],2)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1461127929000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
