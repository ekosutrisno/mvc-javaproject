package mvcapp.AppV1.repositories;

import org.springframework.data.repository.CrudRepository;

import mvcapp.AppV1.models.RegionsModel;

/**
 * RegionsRepository
 */
public interface RegionsRepository extends CrudRepository<RegionsModel, Integer> {

}