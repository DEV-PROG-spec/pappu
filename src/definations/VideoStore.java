package definations;

import java.util.Arrays;

public class VideoStore {
    private Video[] store;

    public VideoStore() {
        this.store = new Video[10];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Video();
        }
    }

    public VideoStore(Video[] store) {
        this.store = store;
    }

    public Video[] getStore() {
        return store;
    }

    public void setStore(Video[] store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoStore that = (VideoStore) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    /**
     * This method adds video to VideoStore Inventory
     *
     * @param name The name of video to be added
     */
    public void addVideo(String name) {
        System.out.println(name + " was added to inventory");
    }

    /**
     * This method help us to rent the video
     *
     * @param name The name of the video to rented
     */
    public void doCheckout(String name) {
        System.out.println("Thank you for renting " + name + ".");
    }

    /**
     * Thus method returns video back to the inventory
     *
     * @param name The name of the video to be returned
     */
    public void doReturn(String name) {
        System.out.println("Thanks for renting, " + name + ".Hope you likr thr video");

    }


}
