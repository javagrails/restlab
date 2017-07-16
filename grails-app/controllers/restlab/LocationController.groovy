package restlab


import grails.rest.*
import grails.converters.*

class LocationController extends RestfulController {
    def locationService
    static responseFormats = ['json', 'xml']
    LocationController() {
        super(Location)
    }

    @Override
    def index() {
        respond locationService.list(params,request)
    }

    @Override
    def show() {
        respond locationService.single(params,request)
    }

    @Override
    def save() {
        def location = locationService.save(params,request)
        respond location
    }

    @Override
    def update() {
        def location = locationService.update(params,request)
        respond location
    }


    @Override
    def delete() {
        def location = locationService.delete(params,request)
        respond location
    }
}
