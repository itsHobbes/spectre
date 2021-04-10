package uk.co.markg.spectre.res.channel;

public interface Channel {

  public static Channel from(ChannelDTO dto) {

    switch (dto.getType()) {
      case 0:
        return new TextChannel(dto);
      case 1:
        return new DirectMessageChannel(dto);
      case 2:
        return new VoiceChannel(dto);
      case 3:
        return new GroupDirectMessageChannel(dto);
      case 4:
        return new Category(dto);
      case 5:
        return new NewsChannel(dto);
      case 6:
        return new StoreChannel(dto);
      default:
        throw new IllegalArgumentException("Invalid channel type");
    }
  }

}
