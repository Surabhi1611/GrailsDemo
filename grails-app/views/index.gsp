%{--<!doctype html>--}%
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Select option</title>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    %{--<script>--}%
        %{--$(document).ready(function(){--}%
            %{--$("#upload").click(function(){--}%
                %{--$.getJSON("http://rest.qa.americanswan.com/api/v1/home", function(result){--}%
                    %{--$.each(result, function(i, field){--}%
                        %{--$("#divy").append(field + " ");--}%
                    %{--});--}%
                %{--});--}%
            %{--});--}%
        %{--});--}%
    %{--</script>--}%
</head>
<body>
<g:form controller="user">
    <inline>
        <g:link controller="user" action="register">Register</g:link>&nbsp;&nbsp;&nbsp;
        <g:link controller="user" action="viewPage" >View</g:link>&nbsp;&nbsp;&nbsp;
    <g:submitButton name="Upload" value="Upload" id="upload" controller="user" action="upload"/>
    <g:link controller="user" action="convert" >Convert Currency</g:link>&nbsp;&nbsp;&nbsp;
</g:form>
%{--<button value="Upload" name="Upload" id="upload">Upload</button>&nbsp;&nbsp;&nbsp;--}%

<div id="divy">


</div>

</body>
</html>
