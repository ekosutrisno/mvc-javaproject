package mvcapp.AppV1.repositories;

import org.springframework.data.repository.CrudRepository;

import mvcapp.AppV1.models.CountryModel;

/**
 * CountryRepository
 */
public interface CountryRepository extends CrudRepository<CountryModel, String> {

}