package hu.pte.mik.prog4.ws;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class CompanyDataResponse {
    public CompanyDataResponse(String id, Double value) {
        this.id = id;
        this.companyPortion = Math.round(value);
    }
    private String id;
    private Long companyPortion;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CompanyDataResponse that = (CompanyDataResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(companyPortion, that.companyPortion) && Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyPortion, map);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Double> getMap() {
        return map;
    }

    public Long getCompanyPortion() {
        return companyPortion;
    }

    public void setCompanyPortion(Long companyPortion) {
        this.companyPortion = companyPortion;
    }

    private final Map<String, Double> map = new HashMap<>();

    public CompanyDataResponse getCompanyData(CompanyDataRequest request) {
        return new CompanyDataResponse(request.getCompanyId(), this.map.computeIfAbsent(request.getCompanyId(),
                companyId -> (double) ThreadLocalRandom.current().nextLong(100000000, 10000000000L)));
    }
}
