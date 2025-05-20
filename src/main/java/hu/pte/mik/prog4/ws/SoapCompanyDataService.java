package hu.pte.mik.prog4.ws;
import jakarta.jws.WebService;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
@WebService(endpointInterface = "hu.pte.mik.prog4.CompanyDataService",
        serviceName = "CompanyDataService",
        targetNamespace = "hu.pte.mik.prog4.ws.soap")
public class SoapCompanyDataService implements CompanyDataService {
    private final Map<String, Double> map = new HashMap();
    public SoapCompanyDataService() {
    }
    @Override
    public CompanyDataResponse getCompanyData(CompanyDataRequest request) {
        return new CompanyDataResponse(request.getCompanyId(), this.map.computeIfAbsent(request.getCompanyId(), (companyId) -> ThreadLocalRandom.current().nextDouble(0.0, 100.0)));
    }
}
