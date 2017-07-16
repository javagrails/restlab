package restlab

class UrlMappings {

    static mappings = {

        // Controller City
        "/cities"(controller: "city", action: "index", method:"GET")
        "/cities/$id"(controller: "city", action: "show", method:"GET")

        "/cities"(controller: "city", action: "save", method:"POST")
        "/cities/$id"(controller: "city", action: "update", method:"PUT")

        "/cities/$id"(controller: "city", action: "delete", method:"DELETE")


        // Controller Location
        "/cities/$cityId/locations"(controller: "location", action: "index", method:"GET")
        "/cities/$cityId/locations/$id"(controller: "location", action: "show", method:"GET")

        "/cities/$cityId/locations"(controller: "location", action: "save", method:"POST")
        "/cities/$cityId/locations/$id"(controller: "location", action: "update", method:"PUT")

        "/cities/$cityId/locations/$id"(controller: "location", action: "delete", method:"DELETE")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
