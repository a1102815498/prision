package club.zqg.prision.service;

import club.zqg.prision.domain.Prisioner;

import java.util.List;

public interface IPrisionerService {
    List<Prisioner> findAllPrisionerInfo();
}
