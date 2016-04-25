<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Currency Conversion</title>
</head>
<body>
<div class="panel-body">
<!--Form Opening-->
    <g:form class="form-vertical" controller="user" action="convert">
        <div class="form-group">
            <label class="control-label col-sm-4">Enter Dirham:</label>

            <div class="col-sm-8">
                <g:textField name="currency" type="text" class="form-control"></g:textField>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-4">Select Currency: </label>

            <div class="dropdown">
                <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Dropdown Example
                    <span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="#">AED</a></li>
                    <li><a href="#">USD</a></li>
                    <li><a href="#">INR</a></li>
                    <li><a href="#">EUR</a></li>
                    <li><a href="#">CAD</a></li>
                </ul>
            </div>
        </div>

    </g:form>
<!--Form Closing-->
</div>

</body>
</html>