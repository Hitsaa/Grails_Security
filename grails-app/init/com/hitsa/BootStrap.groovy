package com.hitsa

class BootStrap {

    def init = { servletContext ->
        new Role(authority: "ROLE_USER").save()
        new Role(authority: "ROLE_ADMIN").save()
    }
    def destroy = {
    }
}
