package src.DatConRecs.Created4V3;

import src.DatConRecs.*;
import src.Files.ConvertDat;
import src.Files.ConvertDat.lineType;
import src.Files.DatConLog;
import src.Files.Signal;
import src.Files.Units;

public class Controller_49_1000 extends RecController {

//    protected short ctrl_pitch = (short) 0;
//
//    protected short ctrl_roll = (short) 0;
//
//    protected short ctrl_yaw = (short) 0;
//
//    protected short ctrl_thr = (short) 0;

    protected short ctrl_mode = (short) 0;

    protected short mode_switch = (short) 0;

    protected short motor_state = (short) 0;

//    protected short sig_level = (short) 0;
//
//    protected short ctrl_level = (short) 0;

    protected short sim_model = (short) 0;

    protected int max_height = (int) 0;

    protected int max_radius = (int) 0;

    protected float D2H_x = (float) 0;

    protected float D2H_y = (float) 0;

    protected short act_req_id = (short) 0;

    protected short act_act_id = (short) 0;

    protected short cmd_mod = (short) 0;

    protected short mod_req_id = (short) 0;

    protected short fw_flag = (short) 0;

    protected short mot_sta = (short) 0;

    protected short OH_take = (short) 0;

    protected short OH_take_f = (short) 0;

    protected short rc_cnt = (short) 0;

    protected short sup_rc = (short) 0;

    protected short is_soaring_up = (short) 0;

    protected float soar_up_timer = (float) 0;

    protected float vert_vel_err = (float) 0;

    protected float vert_vel_err_fltr = (float) 0;

    public Controller_49_1000(ConvertDat convertDat) {
        super(convertDat, 1000, 49);
    }

    @Override
    public void process(Payload _payload) {
        super.process(_payload);
        try {
            valid = true;

            ctrl_pitch = _payload.getShort(0);
            ctrl_roll = _payload.getShort(2);
            ctrl_yaw = _payload.getShort(4);
            ctrl_thr = _payload.getShort(6);
            ctrl_mode = _payload.getUnsignedByte(8);
            mode_switch = _payload.getUnsignedByte(9);
            motor_state = _payload.getUnsignedByte(10);
            sig_level = _payload.getUnsignedByte(11);
            ctrl_level = _payload.getUnsignedByte(12);
            sim_model = _payload.getUnsignedByte(13);
            max_height = _payload.getUnsignedShort(14);
            max_radius = _payload.getUnsignedShort(16);
            D2H_x = _payload.getFloat(18);
            D2H_y = _payload.getFloat(22);
            act_req_id = _payload.getUnsignedByte(26);
            act_act_id = _payload.getUnsignedByte(27);
            cmd_mod = _payload.getUnsignedByte(28);
            mod_req_id = _payload.getUnsignedByte(29);
            fw_flag = _payload.getUnsignedByte(30);
            mot_sta = _payload.getUnsignedByte(31);
            OH_take = _payload.getUnsignedByte(32);
            OH_take_f = _payload.getUnsignedByte(33);
            rc_cnt = _payload.getUnsignedByte(34);
            sup_rc = _payload.getUnsignedByte(35);
            is_soaring_up = _payload.getUnsignedByte(36);
            soar_up_timer = _payload.getFloat(37);
            vert_vel_err = _payload.getFloat(41);
            vert_vel_err_fltr = _payload.getFloat(45);
        } catch (Exception e) {
            RecordException(e);
        }
    }

//    protected static Signal ControllerIntSig = Signal.SeriesInt("Controller",
//            "", null, Units.noUnits);
//
//    protected static Signal ControllerFloatSig = Signal
//            .SeriesFloat("Controller", "", null, Units.noUnits);
//
//    protected static Signal ControllerDoubleSig = Signal
//            .SeriesDouble("Controller", "", null, Units.noUnits);
//
//    public void printCols(lineType lineT) {
//        try {
//
//            printCsvValue(ctrl_pitch, ControllerIntSig, "ctrl_pitch", lineT,
//                    valid);
//            printCsvValue(ctrl_roll, ControllerIntSig, "ctrl_roll", lineT,
//                    valid);
//            printCsvValue(ctrl_yaw, ControllerIntSig, "ctrl_yaw", lineT, valid);
//            printCsvValue(ctrl_thr, ControllerIntSig, "ctrl_thr", lineT, valid);
//            printCsvValue(ctrl_mode, ControllerIntSig, "ctrl_mode", lineT,
//                    valid);
//            printCsvValue(mode_switch, ControllerIntSig, "mode_switch", lineT,
//                    valid);
//            printCsvValue(motor_state, ControllerIntSig, "motor_state", lineT,
//                    valid);
//            printCsvValue(sig_level, ControllerIntSig, "sig_level", lineT,
//                    valid);
//            printCsvValue(ctrl_level, ControllerIntSig, "ctrl_level", lineT,
//                    valid);
//            printCsvValue(sim_model, ControllerIntSig, "sim_model", lineT,
//                    valid);
//            printCsvValue(max_height, ControllerIntSig, "max_height", lineT,
//                    valid);
//            printCsvValue(max_radius, ControllerIntSig, "max_radius", lineT,
//                    valid);
//            printCsvValue(D2H_x, ControllerFloatSig, "D2H_x", lineT, valid);
//            printCsvValue(D2H_y, ControllerFloatSig, "D2H_y", lineT, valid);
//            printCsvValue(act_req_id, ControllerIntSig, "act_req_id", lineT,
//                    valid);
//            printCsvValue(act_act_id, ControllerIntSig, "act_act_id", lineT,
//                    valid);
//            printCsvValue(cmd_mod, ControllerIntSig, "cmd_mod", lineT, valid);
//            printCsvValue(mod_req_id, ControllerIntSig, "mod_req_id", lineT,
//                    valid);
//            printCsvValue(fw_flag, ControllerIntSig, "fw_flag", lineT, valid);
//            printCsvValue(mot_sta, ControllerIntSig, "mot_sta", lineT, valid);
//            printCsvValue(OH_take, ControllerIntSig, "OH_take", lineT, valid);
//            printCsvValue(OH_take_f, ControllerIntSig, "OH_take_f", lineT,
//                    valid);
//            printCsvValue(rc_cnt, ControllerIntSig, "rc_cnt", lineT, valid);
//            printCsvValue(sup_rc, ControllerIntSig, "sup_rc", lineT, valid);
//            printCsvValue(is_soaring_up, ControllerIntSig, "is_soaring_up",
//                    lineT, valid);
//            printCsvValue(soar_up_timer, ControllerFloatSig, "soar_up_timer",
//                    lineT, valid);
//            printCsvValue(vert_vel_err, ControllerFloatSig, "vert_vel_err",
//                    lineT, valid);
//            printCsvValue(vert_vel_err_fltr, ControllerFloatSig,
//                    "vert_vel_err_fltr", lineT, valid);
//        } catch (Exception e) {
//            DatConLog.Exception(e);
//        }
//    }

}