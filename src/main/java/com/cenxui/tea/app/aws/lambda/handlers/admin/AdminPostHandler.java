package com.cenxui.tea.app.aws.lambda.handlers.admin;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * This handler is used for admin to add user
 */
public class AdminPostHandler implements RequestHandler<Object, Object> {
    @Override
    public Object handleRequest(Object input, Context context) {
        //TODO
        return "AdminPostHandler";
    }
}
