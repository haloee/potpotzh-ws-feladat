package hu.pte.mik.prog4.ws;
import java.util.Objects;
public class CompanyDataRequest {
    private String companyId;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        CompanyDataRequest that = (CompanyDataRequest) o;
        return Objects.equals(companyId, that.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(companyId);
}}
