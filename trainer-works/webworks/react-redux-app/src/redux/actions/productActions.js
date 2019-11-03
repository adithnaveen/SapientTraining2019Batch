import axios from 'axios';
import { FETCH_PRODUCTS, FETCH_BRANDS, FETCH_CATEGORIES } from './types';

const baseUrl = 'http://localhost:4000/';

// redux-thunk middleware functions

export function fetchProducts(key = null, value = null) {
    return async function (dispatch) {
        let url = baseUrl + 'products';
        if (key) {
            url += '?' + key + '=' + value;
        }

        let { data } = await axios.get(url);
        dispatch({ type: FETCH_PRODUCTS, products: data })
    }
}

export const fetchCategories = () => async (dispatch) => {
    console.log('>>>> from thunk action fetchCategories..')
    let { data } = await axios.get(baseUrl + 'categories');
    dispatch({ type: FETCH_CATEGORIES, categories: data });
}

export const fetchBrands = () => async (dispatch) => {
    console.log('>>>> from thunk action fetchBrands..')
    let { data } = await axios.get(baseUrl + 'brands');
    dispatch({ type: FETCH_BRANDS, brands: data });
}
