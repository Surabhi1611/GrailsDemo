<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Currency Conversion</title>
</head>

<body>
<div class="panel-body">
<!--Form Opening-->
    <g:form class="form-horizontal" id="currencyConversion" controller="user" action="convert">
        <div class="form-group">
            <label class="control-label col-sm-4">Enter Dirham:</label>

            <div class="col-sm-6">
                <g:textField name="amount" id="amount" type="text" class="form-control"></g:textField>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-4">Select Currency:</label>

            <div class="dropdown col-sm-6">

                <g:select id="fromCurrency" name="fromCurrency" from="${list}"
                          noSelection="['': '-Select Currency-']"
                          class="dropdown dropdown-toggle btn btn-default col-sm-6"
                          data-toggle="dropdown" style="display:inline-block; width: 130px">
                    <div class="caret"></div>
                </g:select>

            </div>
        </div>
        <div>
            <g:submitButton value="Submit" action="convert" name="Submit" class="btn btn-default"
                            style="float:right; background-color:#d2d4d9"></g:submitButton>
        </div>

    </g:form>
<!--Form Closing-->
</div>

</body>
</html>