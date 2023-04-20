package javalearn.homework.day11.SongBuilder;

/**
 * @author Jerforce
 * @date 2023/4/11 星期二 17:39:41
 */
class Song {
    private String name;
    private String singer;
    private int playtime;

    public Song() {
    }

    public Song(String name, String singer, int playtime) {
        this.name = name;
        this.singer = singer;
        this.playtime = playtime;
    }


    public void play() {
        System.out.println("现在正在播放歌曲的是:" + "歌曲名称：" + name + "歌手：" + singer + "播放时间：" + playtime / 60 + "分钟" + playtime % 60 + "秒");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * 设置
     * @param singer
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * 获取
     * @return playtime
     */
    public int getPlaytime() {
        return playtime;
    }

    /**
     * 设置
     * @param playtime
     */
    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    public String toString() {
        return "Song{name = " + name + ", singer = " + singer + ", playtime = " + playtime + "}";
    }
}
