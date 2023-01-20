package com.elvisotieno.imageslider.interfaces

import com.elvisotieno.imageslider.constants.ActionTypes


/**
 * Created by Deniz Coşkun on 10/10/2020.
 * elvisotieno@hotmail.com
 * İstanbul
 */
interface TouchListener {
    /**
     * Click listener touched item function.
     *
     * @param  touched  slider boolean
     */
    fun onTouched(touched: ActionTypes)
}