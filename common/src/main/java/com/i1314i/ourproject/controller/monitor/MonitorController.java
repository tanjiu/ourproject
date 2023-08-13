package com.i1314i.ourproject.controller.monitor;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.service.system.IMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;
import oshi.util.Util;

import java.util.Arrays;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-10-27 9:53
 **/
@RestController
@RequestMapping("/monitor")
public class MonitorController {
    @Autowired
    private IMonitorService monitorService;
    @RequestMapping(value = "/getMonitor")
    public ResultMap getMonitor(){
        return monitorService.getMonitor();
    }

    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        OperatingSystem os = si.getOperatingSystem();
        GlobalMemory memory=hal.getMemory();
        System.out.println("以使用内存: " + FormatUtil.formatBytes(memory.getAvailable()) + "总共内存"
                + FormatUtil.formatBytes(memory.getTotal()));
        System.out.println("Swap used: " + FormatUtil.formatBytes(memory.getSwapUsed()) + "/"
                + FormatUtil.formatBytes(memory.getSwapTotal()));

        Map<String, String> map = System.getenv();
        System.out.println(System.getProperty("os.name"));//获取username
        CentralProcessor processor=hal.getProcessor();
    }
}
