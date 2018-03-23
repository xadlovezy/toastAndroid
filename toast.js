'use strict';
import {NativeModules} from 'react-native'
var ToastM = NativeModules.ToastM;
export default {
    SHORT:ToastM.SHORT,
    LONG:ToastM.LONG,
    show: function (msg: string,
                    duration: number): void {
        ToastM.show(msg, duration);
    },
};

