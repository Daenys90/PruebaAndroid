package cl.desafiolatam.pruebafinal.data.schemas;

import com.google.gson.annotations.SerializedName;

public class YouTubeChannelSchema {

    @SerializedName("nombre")
    private String nombre;
    @SerializedName("type")
    private int type;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("videoUrl")
    private String videoUrl;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("fecha")
    private String fecha;

    public YouTubeChannelSchema(String nombre, int type, String descripcion, String videoUrl, String imageUrl, String fecha) {
        this.nombre = nombre;
        this.type = type;
        this.descripcion = descripcion;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
