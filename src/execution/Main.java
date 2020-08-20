package execution;


import definations.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setVideoName("Baahubali");
        video.setRating(5);
        video.setCheckOut(true);
        System.out.println(video.getVideoName());
        System.out.println(video.getRating());
        System.out.println(video.isCheckOut());

    }
}
