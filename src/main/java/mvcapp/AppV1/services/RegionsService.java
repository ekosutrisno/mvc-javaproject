package mvcapp.AppV1.services;

import mvcapp.AppV1.models.RegionsModel;

/**
 * RegionsService
 */
public interface RegionsService {
  Iterable<RegionsModel> findAllRegions();

  void saveRegion(RegionsModel regionsModel);

  void saveAll(Iterable<RegionsModel> regionsModel);

}