package nl.codelines.example.bootws

import org.springframework.ws.server.endpoint.annotation.Endpoint
import org.springframework.ws.server.endpoint.annotation.PayloadRoot
import org.springframework.ws.server.endpoint.annotation.RequestPayload
import org.springframework.ws.server.endpoint.annotation.ResponsePayload


@Endpoint
class CountryEndpoint(private val countryRepository: CountryRepository) {

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    fun getCountry(@RequestPayload request: GetCountryRequest): GetCountryResponse? {
        val response = GetCountryResponse()
        response.country = countryRepository.findByName(request.name)
        return response
    }

    companion object {
        private const val NAMESPACE_URI = "http://codelines.nl/example/bootws";
    }
}
