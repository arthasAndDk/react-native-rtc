package com.arthas.rtc;

public class RTCEvents {

    public final static String EVENT_DISCONNECT = "Disconnect"; // 连接断开
    public final static String EVENT_RECONNECT = "Reconnect"; // 重连
    public final static String EVENT_CONNECTSTATE = "ConnectState"; // 连接状态
    public final static String EVENT_JOINROOM = "JoinRoom"; // 加入房间
    public final static String EVENT_LEAVEROOM = "LeaveRoom"; // 离开房间
    public final static String EVENT_USERJOIN = "UserJoin"; // 用户加入
    public final static String EVENT_USERLEAVE = "UserLeave"; // 用户离开
    public final static String EVENT_WARNING = "Warning"; // 警告
    public final static String EVENT_ERROR = "Error"; // 错误
    public final static String EVENT_STREAMUPDATE = "StreamUpdate"; // 数据流更新
    public final static String EVENT_REMOTEVIDEOSTATE = "RemoteVideoState"; // 远端视频状态
    public final static String EVENT_VIDEOSIZE = "VideoSize"; // 视频尺寸
    public final static String EVENT_SOUNDLEVEL = "SoundLevel"; // 音量
    public final static String EVENT_USERMUTEVIDEO = "UserMuteVideo"; // 用户禁用视频
    public final static String EVENT_USERMUTEAUDIO = "UserMuteAudio"; // 用户禁用音频

}
