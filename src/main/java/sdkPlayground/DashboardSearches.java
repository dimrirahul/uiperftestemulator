package sdkPlayground;

import com.splunk.JobArgs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rdimri on 2/23/17.
 */
public class DashboardSearches {
    public List<JobArgSearchPair> getSearchesToRun() {
        JobArgsFactory jobArgsFactory = new JobArgsFactory();
        List<JobArgSearchPair> searches = new ArrayList<>();

        String search1 = "search sourcetype = \"*l*\" linecount = \"1\" date_minute = \"*\"  date_wday = \"t*\" | stats  count";
        JobArgs jobArgs1 = jobArgsFactory.getJobArgsWithLatestNow();



        //String search2 = "(( (search source=\\\"*/httpd/access_log*\\\" OR search source=\\\"*\\\\\\\\httpd\\\\\\\\access_log*\\\" ) status=200 file=splunk-* NOT ( ( useragent=\\\"Acoon-*\\\" ) OR ( useragent=\\\"AdsBot-Google *\\\" ) OR ( useragent=\\\"AISearchBot *\\\" ) OR ( useragent=\\\"Baiduspider*\\\" ) OR ( useragent=\\\"* BecomeBot/*\\\" ) OR ( useragent=\\\"Biz360 spider *\\\" ) OR ( useragent=\\\"BlogBridge *\\\" ) OR ( useragent=\\\"Bloglines-Images/*\\\" ) OR ( useragent=\\\"BlogPulseLive *\\\" ) OR ( useragent=\\\"BoardReader/*\\\" ) OR ( useragent=\\\"bot/*\\\" ) OR ( useragent=\\\"* Charlotte*\\\" OR useragent=\\\"*(Charlotte/*)\\\" ) OR ( useragent=\\\"ConveraCrawler/*\\\" ) OR ( useragent=\\\"* DAUMOA-web\\\" ) OR ( useragent=\\\"* discobot*\\\" ) OR ( useragent=\\\"* DoubleVerify *\\\" ) OR ( useragent=\\\"Eurobot/*\\\" ) OR ( useragent=\\\"* Exabot/*\\\" ) OR ( useragent=\\\"FeedHub *\\\" ) OR ( useragent=\\\"Gigabot*\\\" ) OR ( useragent=\\\"* Googlebot/*\\\" OR useragent=\\\"Googlebot-*\\\" ) OR ( useragent=\\\"Grub*\\\" ) OR ( useragent=\\\"gsa-crawler *\\\" ) OR ( useragent=\\\"* heritrix/*\\\" ) OR ( useragent=\\\"ia_archiver*\\\" ) OR ( useragent=\\\"BlogSearch/*\\\" ) OR ( useragent=\\\"ichiro/*\\\" ) OR ( useragent=\\\"Yeti/*\\\" ) OR ( useragent=\\\"Inar_spider *\\\" ) OR ( useragent=\\\"kalooga/*\\\" ) OR ( useragent=KeepAliveClient ) OR ( useragent=\\\"larbin*\\\" ) OR ( useragent=\\\"LinkAider\\\" ) OR ( useragent=\\\"McBot/*\\\" ) OR ( useragent=\\\"MLBot *\\\" ) OR ( useragent=\\\"Morfeus Fucking Scanner\\\" ) OR ( useragent=\\\"msnbot*\\\" ) OR ( useragent=\\\"MSRBOT *\\\" ) OR ( useragent=*nagios-plugins* ) OR ( useragent=\\\"* Netcraft *\\\" ) OR ( useragent=\\\"*/Nutch-*\\\" ) OR ( useragent=\\\"panscient.com\\\" ) OR ( useragent=\\\"Pingdom.com_*\\\" ) OR ( useragent=\\\"PrivacyFinder/*\\\" ) OR ( useragent=\\\"Snapbot/*\\\" ) OR ( useragent=\\\"Sogou *\\\" ) OR ( useragent=\\\"Speedy Spider *\\\" ) OR ( useragent=\\\"Sphere Scout*\\\" ) OR ( useragent=\\\"*(Spinn3r *\\\" ) OR ( useragent=\\\"Technoratibot/*\\\" ) OR ( useragent=\\\"*/Teoma*\\\" ) OR ( useragent=\\\"TurnitinBot/*\\\" ) OR ( useragent=\\\"*(Twiceler*\\\" ) OR ( useragent=\\\"UtilMind *\\\" ) OR ( useragent=\\\"* voilabot *\\\" ) OR ( useragent=\\\"WebAlta*\\\" ) OR ( useragent=\\\"Splunk webping bundle\\\" ) OR ( useragent=\\\"* Yahoo! Slurp*\\\" OR useragent=\\\"* Yahoo! * Slurp*\\\" ) OR ( useragent=\\\"Yanga *\\\" ) OR ( useragent=\\\"YebolBot *\\\" ) ) NOT ( ( clientip=10.0.0.0/8 OR clientip=172.16.0.0/12 OR clientip=192.168.0.0/16 ) ) NOT ( ( clientip=64.127.105.34 OR clientip=64.127.105.60 OR clientip=206.80.3.67 ) ) ) ) _time<1199000000 _time>1198950000   date_second = \\\"*\\\"  | stats count";
        //String search2 = "((source=\\\"*/httpd/access_log*\\\") OR (source=\\\"*\\\\\\\\httpd\\\\\\\\access_log*\\\") ) status=200 file=splunk-* NOT ( ( useragent=\\\"Acoon-*\\\" ) OR ( useragent=\\\"AdsBot-Google *\\\" ) OR ( useragent=\\\"AISearchBot *\\\" ) OR ( useragent=\\\"Baiduspider*\\\" ) OR ( useragent=\\\"* BecomeBot/*\\\" ) OR ( useragent=\\\"Biz360 spider *\\\" ) OR ( useragent=\\\"BlogBridge *\\\" ) OR ( useragent=\\\"Bloglines-Images/*\\\" ) OR ( useragent=\\\"BlogPulseLive *\\\" ) OR ( useragent=\\\"BoardReader/*\\\" ) OR ( useragent=\\\"bot/*\\\" ) OR ( useragent=\\\"* Charlotte*\\\" OR useragent=\\\"*(Charlotte/*)\\\" ) OR ( useragent=\\\"ConveraCrawler/*\\\" ) OR ( useragent=\\\"* DAUMOA-web\\\" ) OR ( useragent=\\\"* discobot*\\\" ) OR ( useragent=\\\"* DoubleVerify *\\\" ) OR ( useragent=\\\"Eurobot/*\\\" ) OR ( useragent=\\\"* Exabot/*\\\" ) OR ( useragent=\\\"FeedHub *\\\" ) OR ( useragent=\\\"Gigabot*\\\" ) OR ( useragent=\\\"* Googlebot/*\\\" OR useragent=\\\"Googlebot-*\\\" ) OR ( useragent=\\\"Grub*\\\" ) OR ( useragent=\\\"gsa-crawler *\\\" ) OR ( useragent=\\\"* heritrix/*\\\" ) OR ( useragent=\\\"ia_archiver*\\\" ) OR ( useragent=\\\"BlogSearch/*\\\" ) OR ( useragent=\\\"ichiro/*\\\" ) OR ( useragent=\\\"Yeti/*\\\" ) OR ( useragent=\\\"Inar_spider *\\\" ) OR ( useragent=\\\"kalooga/*\\\" ) OR ( useragent=KeepAliveClient ) OR ( useragent=\\\"larbin*\\\" ) OR ( useragent=\\\"LinkAider\\\" ) OR ( useragent=\\\"McBot/*\\\" ) OR ( useragent=\\\"MLBot *\\\" ) OR ( useragent=\\\"Morfeus Fucking Scanner\\\" ) OR ( useragent=\\\"msnbot*\\\" ) OR ( useragent=\\\"MSRBOT *\\\" ) OR ( useragent=*nagios-plugins* ) OR ( useragent=\\\"* Netcraft *\\\" ) OR ( useragent=\\\"*/Nutch-*\\\" ) OR ( useragent=\\\"panscient.com\\\" ) OR ( useragent=\\\"Pingdom.com_*\\\" ) OR ( useragent=\\\"PrivacyFinder/*\\\" ) OR ( useragent=\\\"Snapbot/*\\\" ) OR ( useragent=\\\"Sogou *\\\" ) OR ( useragent=\\\"Speedy Spider *\\\" ) OR ( useragent=\\\"Sphere Scout*\\\" ) OR ( useragent=\\\"*(Spinn3r *\\\" ) OR ( useragent=\\\"Technoratibot/*\\\" ) OR ( useragent=\\\"*/Teoma*\\\" ) OR ( useragent=\\\"TurnitinBot/*\\\" ) OR ( useragent=\\\"*(Twiceler*\\\" ) OR ( useragent=\\\"UtilMind *\\\" ) OR ( useragent=\\\"* voilabot *\\\" ) OR ( useragent=\\\"WebAlta*\\\" ) OR ( useragent=\\\"Splunk webping bundle\\\" ) OR ( useragent=\\\"* Yahoo! Slurp*\\\" OR useragent=\\\"* Yahoo! * Slurp*\\\" ) OR ( useragent=\\\"Yanga *\\\" ) OR ( useragent=\\\"YebolBot *\\\" ) ) NOT ( ( clientip=10.0.0.0/8 OR clientip=172.16.0.0/12 OR clientip=192.168.0.0/16 ) ) NOT ( ( clientip=64.127.105.34 OR clientip=64.127.105.60 OR clientip=206.80.3.67 ) ) ) ) _time<1199000000 _time>1198950000   date_second = \\\"*\\\"  | stats count";
        String search2 = "search source=\"*/httpd/access_log*\" " //OR  search source=\"*\\\\httpd\\\\access_log*\" "
                + " status=200 file=splunk-*"
                + " NOT ( ( useragent=\"Acoon-*\" ) OR ( useragent=\"AdsBot-Google *\" ) OR ( useragent=\"AISearchBot *\" ) OR ( useragent=\"Baiduspider*\" ) OR ( useragent=\"* BecomeBot/*\" ) OR ( useragent=\"Biz360 spider *\" ) OR ( useragent=\"BlogBridge *\" ) OR ( useragent=\"Bloglines-Images/*\" ) OR ( useragent=\"BlogPulseLive *\" ) OR ( useragent=\"BoardReader/*\" ) OR ( useragent=\"bot/*\" ) OR ( useragent=\"* Charlotte*\" OR useragent=\"*(Charlotte/*)\" ) OR ( useragent=\"ConveraCrawler/*\" ) OR ( useragent=\"* DAUMOA-web\" ) OR ( useragent=\"* discobot*\" ) OR ( useragent=\"* DoubleVerify *\" ) OR ( useragent=\"Eurobot/*\" ) OR ( useragent=\"* Exabot/*\" ) OR ( useragent=\"FeedHub *\" ) OR ( useragent=\"Gigabot*\" ) OR ( useragent=\"* Googlebot/*\" OR useragent=\"Googlebot-*\" ) OR ( useragent=\"Grub*\" ) OR ( useragent=\"gsa-crawler *\" ) OR ( useragent=\"* heritrix/*\" ) OR ( useragent=\"ia_archiver*\" ) OR ( useragent=\"BlogSearch/*\" ) OR ( useragent=\"ichiro/*\" ) OR ( useragent=\"Yeti/*\" ) OR ( useragent=\"Inar_spider *\" ) OR ( useragent=\"kalooga/*\" ) OR ( useragent=KeepAliveClient ) OR ( useragent=\"larbin*\" ) OR ( useragent=\"LinkAider\" ) OR ( useragent=\"McBot/*\" ) OR ( useragent=\"MLBot *\" ) OR ( useragent=\"Morfeus Fucking Scanner\" ) OR ( useragent=\"msnbot*\" ) OR ( useragent=\"MSRBOT *\" ) OR ( useragent=*nagios-plugins* ) OR ( useragent=\"* Netcraft *\" ) OR ( useragent=\"*/Nutch-*\" ) OR ( useragent=\"panscient.com\" ) OR ( useragent=\"Pingdom.com_*\" ) OR ( useragent=\"PrivacyFinder/*\" ) OR ( useragent=\"Snapbot/*\" ) OR ( useragent=\"Sogou *\" ) OR ( useragent=\"Speedy Spider *\" ) OR ( useragent=\"Sphere Scout*\" ) OR ( useragent=\"*(Spinn3r *\" ) OR ( useragent=\"Technoratibot/*\" ) OR ( useragent=\"*/Teoma*\" ) OR ( useragent=\"TurnitinBot/*\" ) OR ( useragent=\"*(Twiceler*\" ) OR ( useragent=\"UtilMind *\" ) OR ( useragent=\"* voilabot *\" ) OR ( useragent=\"WebAlta*\" ) OR ( useragent=\"Splunk webping bundle\" ) OR ( useragent=\"* Yahoo! Slurp*\" OR useragent=\"* Yahoo! * Slurp*\" ) OR ( useragent=\"Yanga *\" ) OR ( useragent=\"YebolBot *\" ) ) NOT ( ( clientip=10.0.0.0/8 OR clientip=172.16.0.0/12 OR clientip=192.168.0.0/16 ) ) NOT ( ( clientip=64.127.105.34 OR clientip=64.127.105.60 OR clientip=206.80.3.67 ) )))"
                + " _time<1199000000 _time>1198950000 date_second = \"*\"  | stats count ";
        //+ "status=200 file=splunk-* NOT ( ( useragent=\"Acoon-*\" ) OR ( useragent=\"AdsBot-Google *\" ) OR ( useragent=\"AISearchBot *\" ) OR ( useragent=\"Baiduspider*\" ) OR ( useragent=\"* BecomeBot/*\" ) OR ( useragent=\"Biz360 spider *\" ) OR ( useragent=\"BlogBridge *\" ) OR ( useragent=\"Bloglines-Images/*\" ) OR ( useragent=\"BlogPulseLive *\" ) OR ( useragent=\"BoardReader/*\" ) OR ( useragent=\"bot/*\" ) OR ( useragent=\"* Charlotte*\" OR useragent=\"*(Charlotte/*)\" ) OR ( useragent=\"ConveraCrawler/*\" ) OR ( useragent=\"* DAUMOA-web\" ) OR ( useragent=\"* discobot*\" ) OR ( useragent=\"* DoubleVerify *\" ) OR ( useragent=\"Eurobot/*\" ) OR ( useragent=\"* Exabot/*\" ) OR ( useragent=\"FeedHub *\" ) OR ( useragent=\"Gigabot*\" ) OR ( useragent=\"* Googlebot/*\" OR useragent=\"Googlebot-*\" ) OR ( useragent=\"Grub*\" ) OR ( useragent=\"gsa-crawler *\" ) OR ( useragent=\"* heritrix/*\" ) OR ( useragent=\"ia_archiver*\" ) OR ( useragent=\"BlogSearch/*\" ) OR ( useragent=\"ichiro/*\" ) OR ( useragent=\"Yeti/*\" ) OR ( useragent=\"Inar_spider *\" ) OR ( useragent=\"kalooga/*\" ) OR ( useragent=KeepAliveClient ) OR ( useragent=\"larbin*\" ) OR ( useragent=\"LinkAider\" ) OR ( useragent=\"McBot/*\" ) OR ( useragent=\"MLBot *\" ) OR ( useragent=\"Morfeus Fucking Scanner\" ) OR ( useragent=\"msnbot*\" ) OR ( useragent=\"MSRBOT *\" ) OR ( useragent=*nagios-plugins* ) OR ( useragent=\"* Netcraft *\" ) OR ( useragent=\"*/Nutch-*\" ) OR ( useragent=\"panscient.com\" ) OR ( useragent=\"Pingdom.com_*\" ) OR ( useragent=\"PrivacyFinder/*\" ) OR ( useragent=\"Snapbot/*\" ) OR ( useragent=\"Sogou *\" ) OR ( useragent=\"Speedy Spider *\" ) OR ( useragent=\"Sphere Scout*\" ) OR ( useragent=\"*(Spinn3r *\" ) OR ( useragent=\"Technoratibot/*\" ) OR ( useragent=\"*/Teoma*\" ) OR ( useragent=\"TurnitinBot/*\" ) OR ( useragent=\"*(Twiceler*\" ) OR ( useragent=\"UtilMind *\" ) OR ( useragent=\"* voilabot *\" ) OR ( useragent=\"WebAlta*\" ) OR ( useragent=\"Splunk webping bundle\" ) OR ( useragent=\"* Yahoo! Slurp*\" OR useragent=\"* Yahoo! * Slurp*\" ) OR ( useragent=\"Yanga *\" ) OR ( useragent=\"YebolBot *\" ) ) NOT ( ( clientip=10.0.0.0/8 OR clientip=172.16.0.0/12 OR clientip=192.168.0.0/16 ) ) NOT ( ( clientip=64.127.105.34 OR clientip=64.127.105.60 OR clientip=206.80.3.67 ) ) ) ) _time<1199000000 _time>1198950000   date_second = \"*\"  | stats count";
        JobArgs jobArgs2 = jobArgsFactory.getJobArgsWithEarliestTimeAsZeroAndLatestNow();

        String search3 = "search source=\"*dog*\" date_hour = \"*6\"   date_minute =\"3*\"   timestartpos = \"*4\"   date_second =\"4*\"  | stats  count";
        JobArgs jobArgs3 = jobArgsFactory.getJobArgsWithEarliestTimeAsZeroAndLatestNow();



        String search4 = "search source=\"*access_log*\" date_second = \"*3\"  date_hour = 23   date_month =\"j*\" |  stats count";
        JobArgs jobArgs4 = jobArgsFactory.getJobArgsWithEarliestTimeAsZeroAndLatestNow();

        String search5 = "search sourcetype = \"*og*\" date_second = \"2*\" date_year = \"*2\" | stats count";
        JobArgs jobArgs5 = jobArgsFactory.getJobArgsWithLatestNow();

        String search6 = "search * | stats count";


        if (false) {
            searches.add(new JobArgSearchPair(search1, jobArgs1));
            searches.add(new JobArgSearchPair(search1, jobArgs1));
            //searches.add(new JobArgSearchPair(search2, jobArgs2));
            searches.add(new JobArgSearchPair(search3, jobArgs3));

            searches.add(new JobArgSearchPair(search4, jobArgs4));
            searches.add(new JobArgSearchPair(search5, jobArgs5));
        }
        searches.add(new JobArgSearchPair(search6, jobArgs3));


        return searches;
    }

    public DashboardSearches() {

    }
}
