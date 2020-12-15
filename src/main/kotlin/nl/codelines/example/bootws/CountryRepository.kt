package nl.codelines.example.bootws

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class CountryRepository {
    private val countries = mutableMapOf<String, Country>()

    @PostConstruct
    fun init() {
        fun add(name: String, capital: String, currency: Currency, population: Int) {
            val c = Country()
            c.setName(name)
            c.setCapital(capital)
            c.setCurrency(currency)
            c.setPopulation(population)

            countries[c.name] = c
        }

        add("Spain", "Madrid", Currency.EUR, 46704314)
        add("Poland", "Warsaw", Currency.PLN, 38186860)
        add("United Kingdom", "London", Currency.GBP, 63705000)
    }

    fun findByName(name: String) = countries[name]
}
