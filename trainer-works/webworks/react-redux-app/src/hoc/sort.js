import React from 'react';

// export default (data, field = 'id', asc = true) => (OldComp) => (props) => (null);

export default (data, field = 'id', asc = true) => (OldComp) => (props) => {

    const arr = props[data];
    if (arr && arr instanceof Array && arr.length > 0) {
        if (arr[0][field] !== undefined) {
            arr.sort((p1, p2) => {
                if (p1[field] < p2[field]) {
                    return -1;
                }
                else if (p1[field] > p2[field]) {
                    return 1;
                }
                return 0;
            });

            if (!asc) {
                arr.reverse();
            }
        }
    }


    return <OldComp {...props} />;
};

/*

export defult function sort(data, field, asc=true) {
    return function(OldComp) {
        return class NewComp extends Component {
            render () {
                return (null);
            }
        }
    }
}
*/