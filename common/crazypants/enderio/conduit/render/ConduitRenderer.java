package crazypants.enderio.conduit.render;

import crazypants.enderio.conduit.IConduit;
import crazypants.enderio.conduit.IConduitBundle;
import crazypants.enderio.conduit.IFacadable;

public interface ConduitRenderer {

  boolean isRendererForConduit(IConduit conduit);

  void renderEntity(ConduitBundleRenderer conduitBundleRenderer, IConduitBundle te, IConduit con, double x, double y, double z, float partialTick,
      float worldLight);

  boolean isDynamic();

  void renderDynamicEntity(ConduitBundleRenderer conduitBundleRenderer, IFacadable te, IConduit con, double x, double y, double z, float partialTick,
      float worldLight);

}
