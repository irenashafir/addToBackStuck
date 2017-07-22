package shafir.irena.vetstreet.models;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by irena on 22/07/2017.
 */
public class MapItem implements ClusterItem {
    private LatLng mPosition;
    private String mTitle;
    private String mSnippet;

        public MapItem(double lat, double lng) {
            mPosition = new LatLng(lat, lng);
        }

        public MapItem(double lat, double lng, String title, String snippet) {
            mPosition = new LatLng(lat, lng);
            mTitle = title;
            mSnippet = snippet;
        }

        @Override
        public LatLng getPosition() {
            return mPosition;
        }

        @Override
        public String getTitle() {
            return mTitle;
        }

        @Override
        public String getSnippet() {
            return mSnippet;
        }

}
