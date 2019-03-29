package com.fluig.core;

import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;

public class IndexerCore {

    public static void main(String[] args){

        try {
            String url = "http://localhost:8983/solr/fluig";
            HttpSolrClient solr = new HttpSolrClient.Builder(url).build();


            SolrInputDocument document = new SolrInputDocument();
            document.addField("id", "123456");
            document.addField("name", "Kenmore Dishwasher");
            document.addField("price", "599.99");

            solr.add(document);
            solr.commit();

        }catch (Exception e) {

        }
    }

}
