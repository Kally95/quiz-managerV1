import fetch from 'unfetch';

const checkStatus = response => {
        if (response.ok) {
            return response;
        }
        const error = new Error(response.statusText);
        error.response = response;
        return Promise.reject(error);
}

export const getAllUsers = () =>
    fetch("api/v1/users")
        .then(checkStatus).then(res => {return res});
