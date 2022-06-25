import ConnectURI.ConnectURI;
import QuickSort.QuickSort;
import model.GooglePlay;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * by : Riky raharjo
 */
public class Main {
    ArrayList<GooglePlay> productList = new ArrayList<>();
    public ArrayList<GooglePlay> getProductData() throws IOException {
        URL url = ConnectURI.buildURL("https://gplaystore.p.rapidapi.com/applicationDetails");
        String productResponse = ConnectURI.getResponseFromHttpUrl(url);
        assert productResponse != null;
        JSONArray productsJSONArray = new JSONArray(productResponse);
        for (int index = 0; index < productsJSONArray.length(); index++) {
            GooglePlay productModel = new GooglePlay();
            JSONObject myJSONObject = productsJSONArray.getJSONObject(index);
            productModel.set_author(myJSONObject.getString("author"));
            productModel.set_category(myJSONObject.getString("category"));
            productModel.set_changelog(myJSONObject.getString("changelog"));
            productModel.set_contentRating(myJSONObject.getString("contentRating"));
            productModel.set_dataPhublisher(myJSONObject.getString("datePublished"));
            productModel.set_dataPhublishedIso(myJSONObject.getString("datePublishedIso"));
            productModel.set_description(myJSONObject.getString("description"));
            productModel.set_shortDescription(myJSONObject.getString("shortDescription"));
            productModel.set_fileSize(myJSONObject.getString("fileSize"));
            productModel.set_icon(myJSONObject.getString("icon"));
            productModel.set_inAppBilling(myJSONObject.getBoolean(String.valueOf(false)));
            productModel.set_name(myJSONObject.getString("name"));
            productModel.set_numDownload(myJSONObject.getString("numDownload"));
            productModel.set_operatingSystem(myJSONObject.getString("operatingSystem"));

        }
        return productList;
    }

    public static void main(String[] args) {
        Main _main = new Main();
        QuickSort quick = new QuickSort();
    }
}
