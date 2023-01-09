package monprojet.dao;

import java.util.List;

import monprojet.dto.populationPays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import monprojet.entity.City;
import monprojet.entity.Country;

// This will be AUTO IMPLEMENTED by Spring
//

public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query(value ="select sum(population) from city where country_id =:idPays", nativeQuery=true)
    public Integer populationDePays(Integer idPays);

    @Query(value="select country.name as name , count(city.population) as population" +
            " from country inner join city " +
            " on (country.id=city.country_id)" +
            " group by country.name", nativeQuery= true)
    public List <populationPays> populationParPays();


}
