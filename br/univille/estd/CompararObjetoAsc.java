package br.univille.estd;

public class CompararObjetoAsc implements Comparar<LatitudeLongitude> {

    @Override
    public int compareTo(LatitudeLongitude objeto1, LatitudeLongitude objeto2) {
        if (objeto1.getLatitude() < objeto2.getLatitude()) {
            return -1;
        }
        if (objeto1.getLatitude() == objeto2.getLatitude()) {
            if (objeto1.getLongitude() < objeto2.getLongitude()) {
                return -1;
            }
            if (objeto1.getLongitude() == objeto2.getLongitude()) {
                return 0;
            }
        }
        return 1;
    }
}
