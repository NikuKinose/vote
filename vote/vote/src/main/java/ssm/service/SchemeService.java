package ssm.service;

import ssm.pojo.Scheme;
import ssm.pojo.SchemeWithBLOBs;

import java.util.List;


public interface SchemeService {
    public String addScheme(SchemeWithBLOBs scheme);
    public Scheme selectSchemeById(int schemeId);
    public List<Scheme> selectSchemeByMeetingId(int meetingId, String candidateState);
    public int updateSchemeCandidateState(Scheme scheme, String state);
}
