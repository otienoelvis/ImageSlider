package com.elvisotieno.imageslider.interfaces
/**
 * Created by Deniz Coşkun on 10/10/2020.
 * elvisotieno@hotmail.com
 * İstanbul
 */
interface ItemChangeListener {
    /**
     * Click listener changed item function.
     *
     * @param  position  changed item position
     */
    fun onItemChanged(position: Int)
}