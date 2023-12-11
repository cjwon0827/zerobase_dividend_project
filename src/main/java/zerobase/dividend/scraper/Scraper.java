package zerobase.dividend.scraper;

import zerobase.dividend.dto.Company;
import zerobase.dividend.dto.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}
