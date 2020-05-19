package com.tong.practices.y2020.m03.day20;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author: Tong Chuang
 * @date: 2020/3/20
 */
public class ScriptEngineTest {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        engine.put("基数电量",10);
        engine.put("基数电价", 20);
        engine.put("基数电费", "");
        engine.put("基数合约电费","");
        engine.put("flag", false);
        engine.eval("if(flag){基数电费=基数电量 * 基数电价}else {基数电费=基数电价 + 基数电量}基数合约电费;基数电费=基数电价-基数电量");
        System.out.println(engine.get("基数电费"));
        System.out.println(engine.get("基数合约电费"));
    }
}
