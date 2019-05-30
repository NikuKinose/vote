package ssm.service;

import ssm.pojo.Patter;

import java.util.List;

public interface PatterService {
    public List<Patter> selectAllPatter();
    public List<Patter> selectPatter(Patter patter);
}
