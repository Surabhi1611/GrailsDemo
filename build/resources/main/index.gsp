%{--<!doctype html>--}%
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Select option</title>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

</head>
<body>
<g:form controller="user">
    <inline>
        <g:link controller="user" action="register">Register</g:link>&nbsp;&nbsp;&nbsp;
        <g:link controller="user" action="viewPage" >View</g:link>&nbsp;&nbsp;&nbsp;
    <g:submitButton name="Upload" value="Upload" id="upload" controller="user" action="upload"/>
    <g:link controller="user" action="converter" >Convert Currency</g:link>&nbsp;&nbsp;&nbsp;
</g:form>

<div id="divy">

</div>

</body>
</html>
