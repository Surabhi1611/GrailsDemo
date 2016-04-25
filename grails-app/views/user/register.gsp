<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Registration</title>
    <link href="http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
    <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

    <script>
        $(function() {
            $( "#datepicker" ).datepicker();

//            To show today's date by default
//            $( "#datepicker" ).datepicker("setDate", "10w+1");
        });
    </script>

</head>

<body>

<div class="panel-body">
<!--Form Opening-->
    <g:form class="form-vertical" controller="user" action="registeration">
        <div class="form-group">
            <label class="control-label col-sm-4">First Name *</label>

            <div class="col-sm-8">
                <g:textField name="firstName" id="firstName" type="text" class="form-control"></g:textField>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-4">Last Name *</label>

            <div class="col-sm-8">
                <g:textField name="lastName" id="lastName" type="text" class="form-control"></g:textField>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-4">Email *</label>

            <div class="col-sm-8">
                <g:textField name="email" id="email" type="email" class="form-control"></g:textField>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-4" for="userName">Username *</label>

            <div class="col-sm-8">
                <g:textField name="userName" id="userName" class="form-control"></g:textField>
            </div>

            <div class="alert-danger"><g:fieldError field="userName" bean="${user}"/></div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-4">Password *</label>

            <div class="col-sm-8">
                <g:passwordField name="password" id="password" class="form-control"></g:passwordField>
            </div>
        </div>

        %{--<div class="form-group">

            <label class="control-label col-sm-4">Date:</label>

            <div class="col-sm-8">
                <input type="text" name="Start" id="datepicker" placeholder="Select date" contenteditable="false">
            </div>
        </div>--}%

        <div>
            <g:actionSubmit value="Register" action="registeration" name="Register" class="btn btn-default"
                            style="float:right; background-color:#d2d4d9"></g:actionSubmit>
        </div>
    </g:form>
<!--Form Closing-->
</div>
</body>
</html>