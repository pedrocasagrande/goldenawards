package com.raspberry.goldenawards.rest.auth

import jakarta.ws.rs.Consumes
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import org.springframework.stereotype.Component

@Path('v1')
@Consumes('application/json;charset=utf-8')
@Produces('application/json;charset=utf-8')
@Component
class AuthRestAdapter {

    @POST
    @Path('/auth')
}
