package mvcapp.AppV1.services;

import java.util.Optional;

import mvcapp.AppV1.models.RegionsModel;

/**
 * RegionsService
 */
public interface RegionsService {
  Iterable<RegionsModel> findAllRegions();

  void saveRegion(RegionsModel regionsModel);

  void saveAll(Iterable<RegionsModel> regionsModel);

  public Optional<RegionsModel> findRegById(Integer regId);

  void deleteReg(Integer regId);
}