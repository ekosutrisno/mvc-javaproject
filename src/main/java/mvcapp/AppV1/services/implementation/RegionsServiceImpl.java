package mvcapp.AppV1.services.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvcapp.AppV1.models.RegionsModel;
import mvcapp.AppV1.repositories.RegionsRepository;
import mvcapp.AppV1.services.RegionsService;

/**
 * RegionsServiceImpl
 */
@Service
public class RegionsServiceImpl implements RegionsService {

  @Autowired
  private RegionsRepository regionsRepository;

  @Override
  public Iterable<RegionsModel> findAllRegions() {
    return regionsRepository.findAll();
  }

  @Override
  public void saveRegion(RegionsModel regionsModel) {
    regionsRepository.save(regionsModel);
  }

  @Override
  public void saveAll(Iterable<RegionsModel> regionsModel) {
    regionsRepository.saveAll(regionsModel);
  }

  @Override
  public Optional<RegionsModel> findRegById(Integer regId) {
    return regionsRepository.findById(regId);
  }

  public void deleteReg(Integer regId) {
    regionsRepository.deleteById(regId);
  }

}