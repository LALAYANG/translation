

```java

```
/docs/python/python-docs/python-docs-10.md
# Python Docs 10

## Python Docs 10.1

### 10.1.1

```
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error
from sklearn.metrics import r2_score

from sklearn.preprocessing import PolynomialFeatures
from sklearn.pipeline import make_pipeline

from sklearn.linear_model import Ridge
from sklearn.linear_model import Lasso
from sklearn.linear_model import ElasticNet

from sklearn.model_selection import GridSearchCV

from sklearn.model_selection import cross_val_score
from sklearn.model_selection import KFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import learning_curve

from sklearn.model_selection import validation_curve

from sklearn.model_selection import cross_validate

from sklearn.model_selection import cross_val_predict

from sklearn.model_selection import permutation_test_score

from sklearn.model_selection import train_test_split

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import PredefinedSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.model_selection import GroupKFold

from sklearn.model_selection import GroupShuffleSplit

from sklearn.model_selection import StratifiedKFold

from sklearn.model_selection import StratifiedShuffleSplit

from sklearn.model_selection import TimeSeriesSplit

from sklearn.model_selection import KFold

from sklearn.model_selection import ShuffleSplit

from sklearn.model_selection import RepeatedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import RepeatedStratifiedKFold

from sklearn.model_selection import LeaveOneOut

from sklearn.model_selection import LeavePOut

from sklearn.model_selection import LeaveOneGroupOut

from sklearn.model_selection import LeavePGroupsOut

from sklearn.
