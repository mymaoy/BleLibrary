package com.littt.bluelibrary.callback;

import com.littt.bluelibrary.bean.BlueDeviceList;

import java.util.List;

public abstract class BleScanCallback {
    public abstract void onScaning(BlueDeviceList blueDeviceList);
}
